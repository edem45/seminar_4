package seminar5;

class Bird {



}
class Woodpacker implements CanFly {

}


class Ostrich extends Bird implements Runnable {
    public void fly() {
        throw new UnsupportedOperationException("Страус не умеет летать");
    }

    @Override
    public void run() {

    }
}