public class Level1 {
    public static int PrintingCosts(String line) {
        // printer ascii table
        String table = " 0    !   9        \"   6        #  24        $  29        %  22\n " +
                "&  24        '   3        (  12        )  12        *  17        +  13\n " +
                ",   7        -   7        .   4        /  10        0  22        1  19\n " +
                "2  22        3  23        4  21        5  27        6  26        7  16\n " +
                "8  23        9  26        :   8        ;  11        <  10        =  14\n " +
                ">  10        ?  15        @  32        A  24        B  29        C  20\n " +
                "D  26        E  26        F  20        G  25        H  25        I  18\n " +
                "J  18        K  21        L  16        M  28        N  25        O  26\n " +
                "P  23        Q  31        R  28        S  25        T  16        U  23\n " +
                "V  19        W  26        X  18        Y  14        Z  22        [  18\n " +
                "\\  10        ]  18        ^   7        _   8        `   3        a  23\n " +
                "b  25        c  17        d  25        e  23        f  18        g  30\n " +
                "h  21        i  15        j  20        k  21        l  16        m  22\n " +
                "n  18        o  20        p  25        q  25        r  13        s  21\n " +
                "t  17        u  17        v  13        w  19        x  13        y  24\n " +
                "z  19        {  18        |  12        }  18        ~   9 ";

        // String table without ' ' and \n
        String[] tbl = table.split("\\s+");
        tbl[0] = " ";

        int[] tableInt = new int[tbl.length / 2];
        char[] tableChar = new char[tbl.length / 2];

        for (int i = 0; i < tbl.length; i++) {
            if (i % 2 == 0) {
                tableChar[i / 2] = tbl[i].charAt(0);
            } else {
                tableInt[i / 2] = Integer.parseInt(tbl[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < line.length(); i++) {

            for (int j = 0; j < tableChar.length; j++) {
                if (line.charAt(i) == tableChar[j]) {
                    sum += tableInt[j];
                    break;
                } else if (j == tableChar.length - 1) {
                    sum += 23;
                }
            }
        }

        return sum;
    }

}
