package hust.soict.dsai.aims;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Track;

public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd = new DigitalVideoDisc("Aladdin", "Animation", "Roger Allers", 90, 20.95f);
        CompactDisc cd = new CompactDisc("Thriller", "Pop", "Michael Jackson", 50, 14.95f);
        cd.addTrack(new Track("Track 1", 4));
        cd.addTrack(new Track("Track 2", 5));

        try {
            dvd.play();
        } catch (PlayerException e) {
            e.printStackTrace();
        }

        try {
            cd.play();
        } catch (PlayerException e) {
            e.printStackTrace();
        }
    }
}
