package seminar5;

class LightBulb {
    public void turnOn() {
        boolean status = true;
        System.out.println("Лампочка включена");
        // Включение лампочки
    }

    public void turnOff() {
        // Выключение лампочки
        boolean status = false;
        System.out.println("Лампочка выключена");
    }
}
 interface Switchable {
    //private LightBulb bulb;
    public void turnOn();


   // class Switch() {

        LightBulb bulb = new LightBulb();
       //this.bulb = new LightBulb();
    }

   //public void operate() {

     // bulb.turnOn();
  // }
//}