import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("LettersAndNumbers.txt");
            fileWriter.write("1:Aa \n2:Bb\n3:Cc\n4:Dd\n5:Ee\n6:Ff\n7:Gg\n8:Hh\n9:Ii\n10:Jj\n" +
                    "11:Kk\n12:Ll\n13:Mm\n14:Nn\n15:Oo\n16:Pp\n17:Qq\n18:Rr\n19:Ss\n20:Tt\n21:Uu\n22Vv\n23:Ww\n24:Xx\n25:Yy\n26:Zz\n" +
                    "\n27:0\n28:1\n29:2\n30:3\n31:4\n32:5\n33:6\n35:7\n36:8\n37:9 ");
        fileWriter.close();

        }catch (IOException e){
            System.out.println("This file is not found");
        }
        try{
            FileReader fileReader=new FileReader("LettersAndNumbers.txt");
            Scanner scanner=new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        }

    }
