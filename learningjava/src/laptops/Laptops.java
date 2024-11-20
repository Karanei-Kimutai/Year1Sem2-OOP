package laptops;

public class Laptops {
    //Attributes
    private String processor;
    private int RAM;
    private String screen_type;
    private String manufacturer;

    //Constructors
    public Laptops(String processor,int RAM,String screen_type,String manufacturer){
        this.processor=processor;
        this.RAM=RAM;
        this.screen_type=screen_type;
        this.manufacturer=manufacturer;
    }
    //Constructor overloading
    public Laptops(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public Laptops(int RAM){
        this.RAM=RAM;
    }

    //Set methods
    public void setProcessor(String processor){
        this.processor=processor;
    }
    public void setRAM(int RAM){
        this.RAM=RAM;
    }
    public void setScreen_type(String screen_type){
        this.screen_type=screen_type;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }

    //Get methods
    public String getProcessor(){
        return processor;
    }
    public String getScreen_type(){
        return screen_type;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public int getRAM(){
        return RAM;
    }

    //Other methods
    public void showlaptopdetails(){
        System.out.println("Manufacturer:"+getManufacturer());
        System.out.println("Processor:"+getProcessor());
        System.out.println("RAM:"+getRAM());
        System.out.println("Screen type:"+getScreen_type());
    }

}
