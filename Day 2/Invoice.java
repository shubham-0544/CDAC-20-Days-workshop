public class Invoice {
    private String number;
    private  String description;
    private int purchesed;
    private double price;
    
    public Invoice (){
    //parameter less constructor
    
}
//parameterzied constructor
 public Invoice (String number,String description,int purchesed, double price){
    this.number=number;
    this.description=description;
    if (purchesed> 0) {
    this.purchesed = purchesed;
   } else {
    this.purchesed = 0;
 }
 if(price>0){
    this.price=price;
 }
 else{
  this.price=price;
 }
}
   public String getNumber(){
    return number;
   }
  public void setNumber(String number){
    this.number=number;

  }
    public String getDescrption(){
    return description;
   }
  public void setDescrption(String description){
    this.description=description;

  }
    public int  getPurchesed(){
    return purchesed;
   }
  public void setPurchesed(int purchesed){
    this.purchesed=purchesed;

  }
  public double getPrice(){
    return price;
  }
  public void setPrice(double price){
    this.price=price;
  }

  public double getAmount(){
    return  purchesed * price;

  }
  public static void main1(String[] args)
{
    
}
}