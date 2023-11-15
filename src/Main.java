import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] phoneNumbers = {
                "+37063500697",
                "863500697",
                "37063500697",
                "0037063500697",
                "63500697",
                "863500697",
                "8 63500697",
                "8635 00697",
                "8-63500697",
                "8635-00697",
                "8(635)00697",
                "8(635) 00697",
                "8 (635) 00697",
                "63500697",
                "63500697",
                "635 00697",
                "63500697",
                "635-00697",
                "(635)00697",
                "(635) 00697",
                "(635) 00697",
                "37063500697",
                "370 63500697",
                "370 635 00697",
                "370-63500697",
                "370-635-00697",
                "370(635)00697",
                "370 (635) 00697",
                "370 (635) 00697",
                "+37063500697",
                "+370 63500697",
                "+370 635 00697",
                "+370-63500697",
                "+370-635-00697",
                "+370(635)00697",
                "+370 (635) 00697",
                "+370 (635) 00697",
                "0037063500697",
                "00370 63500697",
                "00370 635 00697",
                "00370-63500697",
                "00370-635-00697)))))))))",
                "00000000(35)00697",
                "00370",
                "kkkk6666666666666666666666666"
        };

        for (int i = 0; i < phoneNumbers.length; i++) {
            String phoNo = phoneNumbers[i]; // nebūtina pavadinti tuo pačiu vardu kintamąjį
            formatPhoNo(phoneNumbers[i]);
        }
    }

    public static void formatPhoNo(String phoNo) {
        phoNo = phoNo.trim();  // panaikina tarpus pradžioje ir gale

        String fPhoNo1 = phoNo.replaceAll("[-()+ ]", "");


        for (int i = 0; i < fPhoNo1.length(); i++)
            if (Character.isLetter(phoNo.charAt(i))) {
                System.out.println(fPhoNo1 + " blogas telefono numerio formatas - raidė");
                return;
            }

        if (fPhoNo1.length() < 8) {
            System.out.println(fPhoNo1 + " blogas telefono numerio formatas - per mažai skaitmenų");
            return;
        }
        String fPhoNo2 = fPhoNo1.substring(fPhoNo1.length() - 8);

        // if(fPhoNo2.substring(0,1)).equals("6")    // equals - tas pats, kas ==, tik teisingiau su Stringais


        if (fPhoNo2.charAt(0) != '6') {
            System.out.println(fPhoNo1 + " blogas telefono numerio formatas - pirmas ne 6");
            return;
        }
        String fPhoNo3 = fPhoNo2.replaceAll("[0123456789]", "");
        System.out.println(fPhoNo3);


        //System.out.println(fPhoNo3.length());
        // if (fPhoNo3.length() == 0) {
        //     System.out.println(fPhoNo2);
        //} else {
        //    System.out.println(fPhoNo1 + " blogas telefono numerio formatas");
        //}

    }
}

           /*
        if (fPhoNo2.matches("[0123456789]")) {
        } else {
            System.out.println(fPhoNo2 + " blogas telefono numerio formatas");
        }
         */

        /*
        try{
        int number = Integer.parseInt(fPhoNo2);
            System.out.println(number);
        }
        catch(NumberFormatException ex){
            ex.printStackTrace();
        }
         */

