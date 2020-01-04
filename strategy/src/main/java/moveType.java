public interface moveType {
    String move();
}

class flies implements moveType{

    @Override
    public String move() {
        return "fly";
    }
}


class walks implements moveType{

    @Override
    public String move() {
        return "walks";
    }
}