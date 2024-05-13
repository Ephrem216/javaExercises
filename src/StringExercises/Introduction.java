package StringExercises;

public class Introduction {
    public static void main(String[] args){
        MySting1 name = new MySting1("EPHREM".toCharArray());
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.length());
        System.out.println(name.substring(2,5));
        System.out.println(name.toLowerCase());
        System.out.println(name.equals(new MySting1("EPHREM".toCharArray())));
        System.out.println(MySting1.valueOf(123443124));
//        StringSort s = new StringSort("listen");
//        System.out.println(s.isAnagramWith("silent"));
//        IgnoreNonAlphanumericPalindrome p = new IgnoreNonAlphanumericPalindrome("no*s&%%^#$%@h&%^son");
//        System.out.println(p.isPalindrome());
//        String str =new StringBuilder("welcome to java and spring back").reverse().toString();
//        System.out.println(str);
//        StringBuilder string = new StringBuilder("welcome to java and spring back");
//        string.delete(4,10);
//        System.out.println(string);

//        StringBuilder b = new StringBuilder("Hello");
//        System.out.println(b.reverse());
//        System.out.println(b);
//        CountLetters c = new CountLetters("Hello my name is Ephrem Ketachew and I am pursing Software Engineering at BiT.");
//        int []l = c.count();
//        for(int i = 0; i < l.length; i++)
//            System.out.print(l[i] + " ");
//        Character b = new Character('f');
//        Number num = new Number("59F");
//        System.out.println(num.toDecimal());
//        String name = "Ephrem";
//        String fullName = name.concat(" Ketachew");
//        int l = fullName.length();
//        char c = fullName.charAt(10);
//        System.out.println(fullName);
//        System.out.println(c);
//        System.out.println(l);
//        System.out.println(name.startsWith("e"));
//        System.out.println(name.startsWith("e", 4));
//        System.out.println(name.toString());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.equals("ephrem"));
//        System.out.println(name.equalsIgnoreCase("ephrem"));
//        System.out.println(name.compareTo("Ezira"));
//        System.out.println(name.compareTo("epHrem"));
//        System.out.println(name.compareToIgnoreCase("EpHRem"));
//        System.out.println(name.regionMatches(3,"EpHRem", 3, 1));
//        System.out.println(name.regionMatches(true, 3,"EpHRem", 3, 1));
//        System.out.println(name.compareToIgnoreCase("EpHRem"));
//        System.out.println(name.endsWith("em"));
//        System.out.println(name >= "Ephrem");

    }
}
