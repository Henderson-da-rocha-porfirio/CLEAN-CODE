package src.main.java.functions.nocleancode.args;

/*Consider, for example, the seemingly innocuous function SideEffects.
        This function uses a standard algorithm to match a userName to a password.
        It returns true if they match and false if anything goes wrong.
        But it also has a side effect.*/

public class SideEffects { //UserValidador
        private Cryptographer cryptographer;

        public boolean checkPassword(String userName, String password) {
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
