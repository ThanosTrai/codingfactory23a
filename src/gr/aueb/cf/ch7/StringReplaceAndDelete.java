package gr.aueb.cf.ch7;

public class StringReplaceAndDelete {

    public static void main(String[] args) {
        String firstname = "Maria-Helen";
        String simpleName;
        String nickName;
        String oneName;

        // Replaces dash with whitespace
        simpleName = firstname.replace("-", " ");
        System.out.println(simpleName);

        // Replaces with empty string (string with length() == 0)
        // Thus essentially deletes
        nickName = firstname.replace("-", "");
        System.out.println(nickName);

        //Replaces with empty string - Deletes
        oneName = firstname.replace("-Helen", "");
        System.out.println(oneName);
    }
}
