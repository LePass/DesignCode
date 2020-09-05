package com.design.facade;

/**
 * @author Wangx
 * @create 2020/9/5
 * @since 1.0.0
 * 外观类
 * 1)外观模式可以理解为转换一群接口，客户只要调用一个接口，而不用调用多个接口才能达到目的。
 *      比如：在pc上安装软件的时候经常有一键安装选项（省去选择安装目录、安装的组件等等），
 *      还有就是手机的重启功能（把关机和启动合为一个操作）。
 * 2)外观模式就是解决多个复杂接口带来的使用困难，起到简化用户操作的作用
 */
public class HomeTheaterFacade {

    //定义各个子系统的对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分成四步
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }


    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
