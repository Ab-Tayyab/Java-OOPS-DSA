public class StringsBuilder {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("Abdullah");
        System.out.println("Get character: " + sb.charAt(0));
        System.out.println("Insert character: " + sb.insert(0, "a"));
        System.out.println("Delete character: " + sb.delete(0, 1));
        sb.setCharAt(0, 'a');
        System.out.println("Replace character: " + sb);

        // in stringbuilder memory should same when we add character , changes accur in
        // orignal memory but in simple string new memory created that why string take
        // more time
        StringBuilder he = new StringBuilder("H");
        he.append("e");
        he.append("l");
        he.append("l");
        he.append("o");
        System.out.println(he);

        // reverse a string using stringbuilder
        StringBuilder str = new StringBuilder("hello");
        for(int i=0;i<str.length()/2;i++){
            int start =i;
            int end = str.length()-1-i;
            char startChar= str.charAt(start); 
            char endChar= str.charAt(end); 
            str.setCharAt(start, endChar);
            str.setCharAt(end, startChar);
        }
        System.out.println(str);
    }
}
