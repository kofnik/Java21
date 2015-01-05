package Ex;

public class WordNumber {
    public static void main(String[] args) {
        long num = 0;

        if (args.length > 0) {
            char firstLetter = args[0].charAt(0);
            char secondLetter = args[0].charAt(1);

            switch (firstLetter) {
                case 'o':
                    num = 1L;
                    break;
                case 't':
                    if (secondLetter == 'w'){
                        num = 2L;
                    } else if (secondLetter == 'h') {
                        num = 3L;
                    } else {
                        num = 10L;
                    }
                    break;
                case 'f':
                    if (secondLetter == 'o'){
                        num = 4L;
                    } else {
                        num = 5L;
                    }
                    break;
                case 's':
                    if (secondLetter == 'i') {
                        num = 6L;
                    } else {
                        num = 7L;
                    }
                    break;
                case 'e':
                    num = 8L;
                    break;
                case 'n':
                    num = 9L;
                    break;
            }
            System.out.println(num);
        } else {
            System.out.println("No arguments provided!!");
        }

    }
}
