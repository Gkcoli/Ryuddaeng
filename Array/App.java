public class App{
    public static void main(String[] args) {
        
        char[] myName = {'G' , 'I' , 'A' , 'N'};
       // System.out.println(myName[3]);

        //for(int i=0; i<myName.length; i++){
           // System.out.println(myName);
        
        // for(int i = 3; i>=0; i--){
             //System.out.print(myName[i]);
            for(int i=0; i< myName.length; i++){

            //if(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U'){
                //System.out.print(myName[i]);

                if(!(myName[i] == 'A' || myName[i] == 'E' || myName[i] == 'I' || myName[i] == 'O' || myName[i] == 'U')){
                System.out.print(myName[i]);
            }

        }
    }
}
