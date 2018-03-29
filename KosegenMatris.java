 public static void main(String[] args) {
        
        int sayi;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.print("Sayinizi giriniz : ");
        sayi=oku.nextInt();
        
        for(int i=0;i<sayi;i++){
            for(int j=0;j<sayi;j++){
                if(i==j){
                System.out.print("1");
                }else 
                    System.out.print("0");
            }
            System.out.println();
        }      
    }    
}
