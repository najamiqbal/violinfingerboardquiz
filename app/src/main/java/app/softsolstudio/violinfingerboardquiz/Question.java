package app.softsolstudio.violinfingerboardquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question {
    private String tQuestions[]={
            "a0"
            ,"a1"
            ,"a2"
            ,"a3"
            ,"a4"
            ,"a5"
            ,"a6"
            ,"a7"
            ,"d0"
            ,"d1"
            ,"d2"
            ,"d3"
            ,"d4"
            ,"d5"
            ,"d6"
            ,"d7"
            ,"e0"
            ,"e1"
            ,"e2"
            ,"e3"
            ,"e4"
            ,"e5"
            ,"e6"
            ,"e7"
            ,"g0"
            ,"g1"
            ,"g2"
            ,"g3"
            ,"g4"
            ,"g5"
            ,"g6"
            ,"g7"
    };

    private String wQuestions[]={
            "a0"
            ,"a1"
            ,"a2"
            ,"a3"
            ,"a4"
            ,"a5"
            ,"a6"
            ,"a7"
            ,"d0"
            ,"d1"
            ,"d2"
            ,"d3"
            ,"d4"
            ,"d5"
            ,"d6"
            ,"d7"
            ,"e0"
            ,"e1"
            ,"e2"
            ,"e3"
            ,"e4"
            ,"e5"
            ,"e6"
            ,"e7"
            ,"g0"
            ,"g1"
            ,"g2"
            ,"g3"
            ,"g4"
            ,"g5"
            ,"g6"
            ,"g7"
    };

    public List randomqw(){
        Random randomnum=new Random();
        int rnum=randomnum.nextInt(wQuestions.length);
        List<Integer> randomno=new ArrayList<>();
        List<Integer> randomno2=new ArrayList<>();
        List<String> randomoptions=new ArrayList<>();
        randomno.add(rnum);
        while (randomno.size()<4){
            int num=randomnum.nextInt(tQuestions.length);
            if(!randomno.contains(num))
            {
                randomno.add(num);
            }
        }
        while (randomno2.size()<4){
            int num=randomnum.nextInt(4);
            if(!randomno2.contains(randomno.get(num)))
            {
                randomno2.add(randomno.get(num));
            }
        }
        randomoptions.add(tQuestions[randomno2.get(0)]);
        randomoptions.add(tQuestions[randomno2.get(1)]);
        randomoptions.add(tQuestions[randomno2.get(2)]);
        randomoptions.add(tQuestions[randomno2.get(3)]);
        randomoptions.add(wQuestions[rnum]);
        randomoptions.add(tQuestions[rnum]);
        return randomoptions;
    }


}

