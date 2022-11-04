public class Girl extends Person {
    private String faverShow;
    private String faverColor;
    public Girl(){
        System.out.println("im empty constructor");
    }
    //لاحظ هنا اني قم بعمل الكونستركتور الصغير والذي يعتمد على الكونستركتور الكبير اللي في داخله الاسم و الايميل من خلال كلمة سوبر قمت بارسال الاسم اليه والايميل
    public Girl(String name ,String email,String favercolor){
        super(name,email);
        this.faverColor=favercolor;
    }
    public String getFaverShow() {
        return faverShow;
    }

    public void setFaverShow(String faverShow) {
        this.faverShow = faverShow;
    }

    public String getFaverColor() {
        return faverColor;
    }

    public void setFaverColor(String faverColor) {
        this.faverColor = faverColor;
    }
    
}
