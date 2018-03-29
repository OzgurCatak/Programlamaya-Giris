public static void main(String[] args) {
        
        int satir,sutun;
        
        Scanner oku=new Scanner(System.in);
        
        System.out.print("Satir sayisini giriniz : ");
        satir=oku.nextInt();
        System.out.print("Sutun sayisini giriniz : ");
        sutun=oku.nextInt();
        
        for(int i=1;i<=satir;i++){
            
            for(int j=1;j<=satir;j++){
                
                System.out.print(i*j+" ");
            }
            System.out.println();
        }        
    }
