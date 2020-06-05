import com.jogamp.newt.event.WindowAdapter;
import com.jogamp.newt.event.WindowEvent;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;
import com.jogamp.opengl.util.Animator;

/**
 * Earth class.
 *
 * @author 09x3086
 */
public class Earth implements GLEventListener {

  public static void main(String[] args) {
    new Earth();
  }

  public Earth() {
    GLCapabilities glCapabilities = new GLCapabilities(GLProfile.get(GLProfile.GL3));//(2)
    GLWindow glWindow = GLWindow.create(glCapabilities); //(3)
    glWindow.setTitle("Earth"); //(4)
    glWindow.setSize(300, 300); //(5)

    GLU glu = new GLU();

    GLUquadric quad = glu.gluNewQuadric();
    glu.gluSphere(quad, 2, 10, 15);
    glu.gluDeleteQuadric(quad);

    glWindow.addWindowListener(new WindowAdapter() { //(6)
      @Override
      public void windowDestroyed(WindowEvent evt) {
        System.exit(0);
      }
    });
    glWindow.addGLEventListener(this); //(7)

    Animator animator = new Animator(); //(8)
    animator.add(glWindow);
    animator.start();
    glWindow.setVisible(true); //(10)
  }

  public void init(GLAutoDrawable glAutoDrawable) {

  }

  public void dispose(GLAutoDrawable glAutoDrawable) {

  }

  public void display(GLAutoDrawable glAutoDrawable) {

  }

  public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

  }
}
