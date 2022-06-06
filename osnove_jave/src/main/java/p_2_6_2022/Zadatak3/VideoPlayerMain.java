package p_2_6_2022.Zadatak3;

public class VideoPlayerMain {
    public static void main(String[] args) {

        VideoPlayer v = new VideoPlayer(240,
                220,
                5,
                144);
        v.print();
        System.out.println();


        TimeControl t = new TimeControl(true);

        t.izvrsiAkciju(v);
        t.izvrsiAkciju(v);
        t.izvrsiAkciju(v);
        t.izvrsiAkciju(v);

        AudioControl a = new AudioControl(false);
        a.izvrsiAkciju(v);
        a.izvrsiAkciju(v);
        a.izvrsiAkciju(v);
        a.izvrsiAkciju(v);
        a.izvrsiAkciju(v);
        a.izvrsiAkciju(v);
        a.izvrsiAkciju(v);


        QualityOptimizerControl q = new QualityOptimizerControl(20);
        q.izvrsiAkciju(v);

        v.print();
    }
}
