package game;

/**
 * Created by Kiéran on 15/10/2015.
 */
public class ControlGroup {
    protected Model model;
    protected Vue vue;

    protected ControlMenu cm;
    protected ControlButton cb;
    protected ControlKey ck;

    public ControlGroup(Model m) {
        model = m;
        vue = new Vue(model,vue);

        cb = new ControlButton(model, vue);
        cm = new ControlMenu(model, vue);
        ck = new ControlKey(model, vue);
    }
}