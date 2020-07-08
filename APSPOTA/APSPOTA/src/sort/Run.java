
package sort;

public class Run {
    sort s = new sort();
    private final int TAM1 = 5;
    private final int TAM2 = 10;
    private final int TAM3 = 50;
    private final int TAM4 = 100;
    private final int TAM5 = 1000;
    private final int TAM6 = 10000;
    private final int vet1[] = new int[TAM1];
    private final int vet2[] = new int[TAM2];
    private final int vet3[] = new int[TAM3];
    private final int vet4[] = new int[TAM4];
    private final int vet5[] = new int[TAM5];
    private final int vet6[] = new int[TAM6];
    
    public Run (){
        for (int i = 0; i < TAM1; i++) {
            vet1[i] = (int) (Math.random() * TAM5);
        }
        for (int i = 0; i < TAM2; i++) {
            vet2[i] = (int) (Math.random() * TAM5);
        }
        for (int i = 0; i < TAM3; i++) {
            vet3[i] = (int) (Math.random() * TAM5);
        }
        for (int i = 0; i < TAM4; i++) {
            vet4[i] = (int) (Math.random() * TAM5);
        }
        for (int i = 0; i < TAM5; i++) {
            vet5[i] = (int) (Math.random() * TAM5);
        }
         for (int i = 0; i < TAM6; i++) {
            vet6[i] = (int) (Math.random() * TAM5);
        }
    }
    
    public void initBubble() {
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();
        System.out.println("########## BubbleSort ##########\n\n");
        
        
        
            
        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.BubbleSort(vet1C)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");

        
        

        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.BubbleSort(vet2C)+ "\n");
        
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
        

        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.BubbleSort(vet3C)+ "\n");
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        
        

        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.BubbleSort(vet4C)+ "\n");

        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        

        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.BubbleSort(vet5C)+ "\n");        
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
        
        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.BubbleSort(vet6C)+ "\n");        
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }

    public void initInsertion() {
        System.out.println("########## InsertionSort ##########\n");
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();
        


        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.InsetionSort(vet1C)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");

        
        

        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.InsetionSort(vet2C)+ "\n");
        
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
        
        
        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.InsetionSort(vet3C)+ "\n");
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        
        

        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.InsetionSort(vet4C)+ "\n");

        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        
        
        

        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.InsetionSort(vet5C)+ "\n");        
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
        

        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.InsetionSort(vet6C)+ "\n");        
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }

    public void initSelection() {
        System.out.println("########## SelectionSort ##########\n\n");
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();

        
        
        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.SelectionSort(vet1C)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");
        
        
        
        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.SelectionSort(vet2C)+ "\n");
        
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
        
        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.SelectionSort(vet3C)+ "\n");
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        
        
        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.SelectionSort(vet4C)+ "\n");
        
        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        
        
        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.SelectionSort(vet5C)+ "\n");  
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
        
        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.SelectionSort(vet6C)+ "\n");   
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }

    public void initCocktail() {
        System.out.println("########## CocktailSort ##########\n\n");        
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();

        
        
        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.CocktailSort(vet1C)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");

        
        
        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.CocktailSort(vet2C)+ "\n");
        
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
        
        
        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.CocktailSort(vet3C)+ "\n");
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        
        
        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.CocktailSort(vet4C)+ "\n");
        
        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        
        
        
        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.CocktailSort(vet5C)+ "\n");   
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
        
        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.CocktailSort(vet6C)+ "\n");   
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }

    public void initMerge() {
        System.out.println("########## MergeSort ##########\n\n");
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();
        


        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.MergeSort(vet1C, 0 , vet1C.length - 1)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");

        

        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.MergeSort(vet2C, 0 , vet2C.length - 1)+ "\n");
        
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
     
        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.MergeSort(vet3C, 0 , vet3C.length - 1)+ "\n");
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        

        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.MergeSort(vet4C, 0 , vet4C.length - 1)+ "\n");

        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        

        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.MergeSort(vet5C, 0 , vet5C.length - 1)+ "\n");        
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
       
        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.MergeSort(vet6C, 0 , vet6C.length - 1)+ "\n");        
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }

    public void initShell() {
        System.out.println("########## ShellSort ##########\n\n");
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();
        


        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.ShellSort(vet1C)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");


        
        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.ShellSort(vet2C)+ "\n");
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
        
        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.ShellSort(vet3C)+ "\n");
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        
        
        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.ShellSort(vet4C)+ "\n");

        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        
        
        
        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.ShellSort(vet5C)+ "\n");        
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
        
        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.ShellSort(vet6C)+ "\n");        
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }
    
    
    
    
    public void initQuick() {

        System.out.println("########## QuickSort ##########\n\n");
        int vet1C[] = vet1.clone();
        int vet2C[] = vet2.clone();
        int vet3C[] = vet3.clone();
        int vet4C[] = vet4.clone();
        int vet5C[] = vet5.clone();
        int vet6C[] = vet6.clone();
        


        long inicio1 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 5 é " + s.quickSort(vet1C, 0 , vet1C.length - 1)+ "\n");
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo vetor 5 :\t" + (fim1 - inicio1) + "\n");

        

        long inicio2 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10 é " + s.quickSort(vet2C, 0 , vet2C.length - 1)+ "\n");
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10 :\t" + (fim2 - inicio2) + "\n");
        
        
        

        long inicio3 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 50 é " + s.quickSort(vet3C, 0 , vet3C.length - 1)+ "\n");
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo vetor 50 :\t" + (fim3 - inicio3) + "\n");
        
        
        
        long inicio4 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 100 é " + s.quickSort(vet4C, 0 , vet4C.length - 1)+ "\n");

        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo vetor 100 :\t" + (fim4 - inicio4) + "\n");
        
        
        
        
        long inicio5 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 1000 é " + s.quickSort(vet5C, 0 , vet5C.length - 1)+ "\n");        
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo vetor 1000 :\t" + (fim5 - inicio5) + "\n");
        
        
        
        long inicio6 = System.currentTimeMillis();
        System.out.println("O numero de comparaçoes do vetor 10000 é " + s.quickSort(vet6C, 0 , vet6C.length - 1)+ "\n");        
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo vetor 10000 :\t" + (fim6 - inicio6) + "\n");
    }

}
