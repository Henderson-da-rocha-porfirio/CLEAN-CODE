package src.main.java.functions.cleancode.args;

/*The side effect is the call to Session.initialize(), of course.
 The checkPassword function, by its name, says that it checks the password.
 The name does not imply that it initializes the session.
 So a caller who believes what the name of the function says runs the risk of erasing the existing session
 data when he or she decides to check the validity of the user. This side effect creates a temporal coupling.
 That is, checkPassword can only be called at certain times (in other words, when it is safe to initialize the session).
 If it is called out of order, session data may be inadvertently lost.
 Temporal couplings are confusing, especially when hidden as a side effect.
 If you must have a temporal coupling, you should make it clear in the name of the function.
 In this case we might rename the function checkPasswordAndInitializeSession, though that certainly violates “Do one thing.”.*/

public class SideEffects { //UserValidador
        private Cryptographer cryptographer;

        public boolean checkPasswordAndInitializeSession(String userName, String password) {
            User user = UserGateway.findByName(userName);
            if (user != User.NULL) {
                String codedPhrase = user.getPhraseEncodedByPassword();
                String phrase = cryptographer.decrypt(codedPhrase, password);
                if (" Valid Password".equals(phrase)) {
                    Session.initialize();
                    return true;
                }
            }
            return false;
        }
    }
}
