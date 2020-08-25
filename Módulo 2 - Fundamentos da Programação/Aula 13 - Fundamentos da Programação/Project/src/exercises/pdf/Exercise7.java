package exercises.pdf;

import java.io.*;

public class Exercise7 {
    static BufferedReader bf;

    public static void main(String[] args) throws IOException {
        bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("Então você é: %s para ter uma carteira de motorista",
                checkCNH()? "qualificado" : "desqualificado"));
        bw.flush();
    }

    static boolean checkCNH() throws IOException {
        System.out.println("Digite sua idade");
        if (Integer.parseInt(bf.readLine().trim()) < 18)
            return false;

        System.out.println("Você é alfabetizado? [y/n]");
        if(bf.readLine().trim().toLowerCase().equals("n"))
            return false;

        System.out.println("Digite seu CPF [xxxxxxxxx-xx]");
        return checkCPF(bf.readLine().trim());
    }

    static boolean checkCPF(String cpf) {
        String[] cpfSplit = cpf.split("-");

        char one = cpfSplit[1].charAt(0);
        char two = cpfSplit[1].charAt(1);
        String base = cpfSplit[0];

        return check(base, one) && check(base + one, two) &&
                checkEqual(base + one + two);
    }

    static boolean check(String base, char checker) {
        int sum = 0;

        for(int i = 0; i < base.length(); i++) {
            sum += Character.getNumericValue(base.charAt(i)) * ((base.length() + 1) - i);
        }

        int rest = 11 - (sum % 11);
        if(rest == 10 || rest == 11)
            rest = 0;

        return rest == Character.getNumericValue(checker);
    }

    static boolean checkEqual(String cpf) {
        for(int i = 0; i < 11; i++) {
            int count = 0;

            for(int j = 0; j < 10; j++) {
                if(i == Character.getNumericValue(cpf.charAt(j)))
                    count++;
            }

            if(count == 10)
                return false;
        }

        return true;
    }

}
