public static void main(String[] args) {
        
        int sayi ;
        int x=1;
        int y=1;
        int z;
        
        Scanner oku=new Scanner(System.in);
         
        System.out.print("Bir sayi giriniz : ");
        sayi=oku.nextInt();  
        
        System.out.print(x+" ");
        System.out.print(y+" ");
        
        for (int i=0;i<(sayi-2);i++){
            z=x+y;
            x=y;
            y=z;
            System.out.print(z+" ");        
    }
    }
