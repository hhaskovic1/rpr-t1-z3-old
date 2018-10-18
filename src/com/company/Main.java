package com.company;

public class Main {

    class Sat {
        private int sati;
        private int  minute;
        private int sekunde;


        Sat(int sati, int minute, int sekunde) {
            postavi(sati,minute,sekunde);
        }
        private void postavi(int sati, int minute, int sekunde) {
            this.sati=sati;
            this.minute=minute;
            this.sekunde=sekunde;
        }
        private void sljedeci() {
            sekunde++;
            if (sekunde==60) { sekunde=0; minute++; }
            if (minute==60) { minute=0; sati++; }
            if (sati==24) sati=0;
        }

        private void prethodni() {
            sekunde--;
            if (sekunde==-1) { sekunde=59; minute--; }
            if (minute==-1) { minute=59; sati--; }
            if (sati==-1) sati=23;
        }
        private void pomjeriZa(int pomak) {
            if (pomak>0)
                for (int i=0; i<pomak; i++) sljedeci();
        else
            for (int i=0; i<-pomak; i++) prethodni();
        }
        private int dajSate() const { return sati; }
        private int dajMinute() const { return minute; }
        private int dajSekunde() const { return sekunde; }
        private void ispisi() const { System.out.println( sati + minute + sekunde); }
    };


        public static void main(String[] args) {
	Sat s(15,30,45);
            s.ispisi();
            s.sljedeci();
            s.ispisi();
            s.pomjeriZa(-48);
            s.ispisi();
            s.postavi(0,0,0);
            s.ispisi();

        }
}
