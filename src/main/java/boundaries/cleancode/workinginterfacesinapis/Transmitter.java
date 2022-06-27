package boundaries.cleancode.workinginterfacesinapis;

/*        A number of years back I was part of a team developing software for a radio communications system.
        There was a subsystem, the “Transmitter,” that we knew little about, and the people responsible for the subsystem
        had not gotten to the point of defining their interface. We did not want to be blocked, so we started our work far away from the
        unknown part of the code. We had a pretty good idea of where our world ended and the new world began.
        As we worked, we sometimes bumped up against this boundary.
        Though mists and clouds of ignorance obscured our view beyond the boundary, our work made us aware of
        what we wanted the boundary interface to be. We wanted to tell the transmitter something like this:
        Key the transmitter on the provided frequency and emit an analog representation of the data coming from this stream.
        We had no idea how that would be done because the API had not been designed yet. So we decided to work out the details later.
        To keep from being blocked, we defined our own interface. We called it something catchy, like Transmitter.
        We gave it a method called transmit that took a frequency and a data stream. This was the interface we wished we had.
        One good thing about writing the interface we wish we had is that it’s under our control.
        This helps keep client code more readable and focused on what it is trying to accomplish.*/

public interface Transmitter {

    ...

    void transmit(frequency, stream) {

        return;
    }

    ...
}
