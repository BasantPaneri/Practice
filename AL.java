public class AL {
  public AL(){System.out.println("ArrayList Created......");}
  
  int arr[] = new int[1];
  int i = 0;
  
  public void growArray(int n){
      
      int fresh [] = new int[arr.length + n ];
      for(int i = 0 ; i <arr.length; i++ )
        fresh[i] = arr[i];
      arr = fresh;
    }

    public void add( int ind, int value){
      if(ind >= 0  && ind < arr.length){
        arr[ind] =  value;
      }else if(ind < 0 ){
        growArray(1);
        i++;
        arr[arr.length-1] = value;
      }
      
    }
    
    public void add(int value){
      if(i >= arr.length) growArray(1);
      arr[i++] = value;
    }
  
    @Override
    public String toString(){
      String str = "";
      for(int j = 0 ; j<arr.length; j++){
        str += arr[j]+", ";
      }
      return str;
    }
}
