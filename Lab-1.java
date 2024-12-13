public class Main {
    public static void WallPainter(){
        int walllength;
        int numbuckets;

        walllength=700;
        walllength=walllength*2;

        numbuckets=walllength/100;
        if(walllength%100!=0)
            numbuckets=numbuckets+1;
        System.out.println(numbuckets+" buckets required for walllength "+walllength/2);

        walllength=2950;
        walllength=walllength*2;

        numbuckets=walllength/100;
        if(walllength%100!=0)
            numbuckets=numbuckets+1;
        System.out.println(numbuckets+" buckets required for walllength "+walllength/2);

        walllength=462;
        walllength=walllength*2;

        numbuckets=walllength/100;
        if(walllength%100!=0)
            numbuckets=numbuckets+1;

        System.out.println(numbuckets+" buckets required for walllength "+walllength/2);

    }

    public static void main(String[] args) {
        String greeting,introduction,goodbye;

        greeting="hi everyone";
        introduction="my name is mark";
        goodbye="nice meeting you all";


        System.out.println(greeting+" "+introduction+" "+goodbye);
        WallPainter();
    }
}
