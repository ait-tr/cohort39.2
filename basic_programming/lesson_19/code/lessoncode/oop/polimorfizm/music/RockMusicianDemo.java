package oop.polimorfizm.music;

public class RockMusicianDemo {
    public static void main(String[] args) {
        RockMusician musician = new RockMusician();
        Singer singer = new RockMusician();
        Dancer dancer = new RockMusician();

        musician.dance();
        musician.sing();

//        singer.sing();
//        dancer.dance();


        Singer[] singers = {
                new PopMusician(),
                new RockMusician()
        };

//        singers[0].sing();
//        singers[1].sing();

        Singer[] musicianSing = {
                new RockMusician(), new PopMusician(),
                new RockMusician(), new PopMusician(),
                new RockMusician(), new PopMusician(),
                new RockMusician()
        };

        Dancer[] musicianDance = {
                new RockMusician(), new PopMusician(),
                new RockMusician(), new PopMusician(),
                new RockMusician(), new PopMusician(),
                new RockMusician()
        };

        System.out.println("===============");

        MusicianService service = new MusicianService();
        service.singAll(musicianSing);
        service.danceAll(musicianDance);



        Musician[] musicians = { new RockMusician(), new PopMusician(),
                new RockMusician(), new PopMusician(),
                new RockMusician(), new PopMusician(),
                new RockMusician()};


        System.out.println("====================");
        service.singAll(musicians);
        service.danceAll(musicians);
    }
}
