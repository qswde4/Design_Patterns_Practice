package principles.demo5;

public class Client {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("Travis Scott");
        //创建粉丝对象
        Fans fans = new Fans("qswde4");
        agent.setStar(star);
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("UMG");
        agent.setCompany(company);

        agent.meeting();//和粉丝见面
        agent.business();//和媒体公司洽谈业务
    }
}
