public class Student {

    private String FIO;
    private String group;
    private int averageMark;

    public Student (String _FIO, String _group, int _averageMark) {
        FIO = _FIO;
        group = _group;
        averageMark = _averageMark;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String _FIO) {
        FIO = _FIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String _group) {
        group = _group;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int _averageMark) {
        averageMark = _averageMark;
    }

    public void println() {
        System.out.println(FIO + " " + group + " " + averageMark);
    }
}