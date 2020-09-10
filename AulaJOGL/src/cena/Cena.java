package cena;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.glu.GLU;
/**
 *
 * @author Siabreu
 */
public class Cena implements GLEventListener{    
    private float xMin, xMax, yMin, yMax, zMin, zMax;    
    GLU glu;
    
    @Override
    public void init(GLAutoDrawable drawable) {
        //dados iniciais da cena
        glu = new GLU();
        //Estabelece as coordenadas do SRU (Sistema de Referencia do Universo)
        xMin = yMin = zMin = -1;
        xMax = yMax = zMax = 1;        
    }

    @Override
    public void display(GLAutoDrawable drawable) {  
        //obtem o contexto Opengl
        GL2 gl = drawable.getGL().getGL2();                
        //define a cor da janela (R, G, G, alpha)
        gl.glClearColor(0, 0, 0, 1);
        //limpa a janela com a cor especificada
        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);       
        gl.glLoadIdentity(); //lê a matriz identidade
        
        /*
            desenho da cena        
        *
        */

        //gl.glColor3f(0,1,1); //cor branca
//        desenha um retangulo
//        gl.glBegin(GL2.GL_POLYGON);
//            gl.glVertex2f(0, 0);
//            gl.glVertex2f(0.4F, 0.3F);
//            gl.glVertex2f(0.7F, -0.3F);
//        gl.glEnd();

//      EX1

//        gl.glColor3f(0,1,1);
//
//        gl.glPointSize(2);
//        gl.glBegin(GL2.GL_POINTS);
//            gl.glVertex2f(0, 0);
//
//            gl.glVertex2f(0.2F, 0.2F);
//
//            gl.glVertex2f(0.3F, -0.3F);
//
//        gl.glEnd();
//
//        gl.glColor3f(1,0,1);
//
//        gl.glPointSize(4);
//        gl.glBegin(GL2.GL_POINTS);
//        gl.glVertex2f(0.4F, 0.35F);
//
//        gl.glVertex2f(0.3F, 0.3F);
//
//        gl.glEnd();

//      EX2
//        gl.glColor3f(1,1,0);
//        gl.glLineWidth(3);
//        gl.glBegin(GL2.GL_LINES);
//        gl.glVertex2f(0.1F, 0.2F);
//        gl.glVertex2f(0.3F, 0.4F);
//
//        gl.glEnd();
//
//
//        gl.glLineWidth(1);
//        gl.glBegin(GL2.GL_LINES);
//        gl.glVertex2f(0.2F, 0.3F);
//        gl.glVertex2f(0.5F, 0.6F);
//
//        gl.glEnd();


//     EX3


        gl.glColor3f(0,0,1);

        gl.glBegin(GL2.GL_POINTS);
            gl.glVertex2f(-0.9F, 0.9F);
            gl.glVertex2f(-0.9F, 0.7F);
            gl.glVertex2f(-0.7F, 0.9F);
            gl.glVertex2f(-0.7F, 0.7F);
        gl.glEnd();
        gl.glBegin(GL2.GL_LINES);
            gl.glVertex2f(0, 0);//linha 1
            gl.glVertex2f(0, 1);
            gl.glVertex2f(0, 0);//linha 2
            gl.glVertex2f(1, 0);
            gl.glVertex2f(0, 0);//linha 3
            gl.glVertex2f(-1, -1);
        gl.glEnd();
        gl.glBegin(GL2.GL_LINE_LOOP);
            gl.glVertex2f(-0.5F, 0.3F);
            gl.glVertex2f(-0.4F, 0.5F);
            gl.glVertex2f(-0.3F, 0.4F);
            gl.glVertex2f(-0.2F, 0.5F);
            gl.glVertex2f(-0.2F, 0.2F);
            gl.glVertex2f(-0.3F, 0.3F);
            gl.glVertex2f(-0.4F, 0.2F);
        gl.glEnd();
        gl.glBegin(GL2.GL_POLYGON);
            gl.glVertex2f(-0.9F, -0.4F);
            gl.glVertex2f(-0.7F, -0.1F);
            gl.glVertex2f(-0.5F, -0.2F);
            gl.glVertex2f(-0.2F, -0.1F);
            gl.glVertex2f(-0.3F, -0.5F);
        gl.glEnd();
        gl.glBegin(GL2.GL_TRIANGLE_FAN);
            gl.glVertex2f(0.2F, -0.9F);
            gl.glVertex2f(0.7F, -0.8F);
            gl.glVertex2f(0.8F, -0.7F);
            gl.glVertex2f(0.6F, -0.6F);
            gl.glVertex2f(0.5F, -0.4F);
            gl.glVertex2f(0.2F, -0.5F);
        gl.glEnd();
        gl.glBegin(GL2.GL_QUADS);
            gl.glVertex2f(0.8F, 0.1F);//primeiro quad
            gl.glVertex2f(0.9F, 0.1F);
            gl.glVertex2f(0.9F, 0.2F);
            gl.glVertex2f(0.8F, 0.2F);
            gl.glVertex2f(0.7F, 0.2F);//segundo quad
            gl.glVertex2f(0.8F, 0.2F);
            gl.glVertex2f(0.8F, 0.3F);
            gl.glVertex2f(0.7F, 0.3F);
            gl.glVertex2f(0.6F, 0.3F);//terceiro quad
            gl.glVertex2f(0.7F, 0.3F);
            gl.glVertex2f(0.7F, 0.4F);
            gl.glVertex2f(0.6F, 0.4F);
        gl.glEnd();

//        desenha um circulo
//        double limite = 2*Math.PI;
//        double i, cX, cY, rX, rY;
//        cX = 0;
//        cY = 0;
//        rX = 0.5F;
//        rY = 0.5F;
//
//        gl.glBegin(GL2.GL_POLYGON);
//        for (i = 0; i < limite; i+=0.01) {
//            gl.glVertex2d(cX + rX * Math.cos(i),cY + rY * Math.sin(i));
//        }
//        gl.glEnd();

        gl.glFlush();      
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {    
        //obtem o contexto grafico Opengl
        GL2 gl = drawable.getGL().getGL2();  
        
        //evita a divisão por zero
        if(height == 0) height = 1;
        //calcula a proporção da janela (aspect ratio) da nova janela
        float aspect = (float) width / height;
        
        //seta o viewport para abranger a janela inteira
        gl.glViewport(0, 0, width, height);
                
        //ativa a matriz de projeção
        gl.glMatrixMode(GL2.GL_PROJECTION);      
        gl.glLoadIdentity(); //lê a matriz identidade
        
        //Projeção ortogonal
        //true:   aspect >= 1 configura a altura de -1 para 1 : com largura maior
        //false:  aspect < 1 configura a largura de -1 para 1 : com altura maior
        if(width >= height)            
            gl.glOrtho(xMin * aspect, xMax * aspect, yMin, yMax, zMin, zMax);
        else        
            gl.glOrtho(xMin, xMax, yMin / aspect, yMax / aspect, zMin, zMax);
                
        //ativa a matriz de modelagem
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity(); //lê a matriz identidade
        System.out.println("Reshape: " + width + ", " + height);
    }    
       
    @Override
    public void dispose(GLAutoDrawable drawable) {}         
}
