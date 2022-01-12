import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new TreeSet<>();
        Set<Integer> b = new TreeSet<>();
        Set<Integer> c = new TreeSet<>();

        System.out.print("How many students for course A?");
        int qtdA = sc.nextInt();
        a = addAlunos(qtdA);

        System.out.print("How many students for course B?");
        int qtdB = sc.nextInt();
        b = addAlunos(qtdB);

        System.out.print("How many students for course C?");
        int qtdC = sc.nextInt();
        c = addAlunos(qtdC);

        Set<Integer> d = new TreeSet<>(a);
        d.addAll(b);
        d.addAll(c);

        System.out.println("Total students : " + d.size());

    }

    public static Set<Integer> addAlunos(int qtdAlunos){
        Set<Integer> aux = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < qtdAlunos; i++){
            int codAluno = sc.nextInt();
            aux.add(codAluno);
        }
        return aux;
    }
}
