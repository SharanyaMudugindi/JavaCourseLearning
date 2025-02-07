public class RingAnnouncer {
    public static void main(String[] args) {
       
        String[] record={"Win","lose","Win","lose","Win","lose"};
        int win=0;
        int lose=0;
        for(int i=0;i<record.length;i++)
        {
            if(record[i].equals("Win"))
            {
                win++;
            }
            else{
                lose++;
            }

        }
        System.out.println("number of wins "+win+"\nnumber of loses "+lose);

    }
}
