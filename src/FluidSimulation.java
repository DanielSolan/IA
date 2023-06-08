public class FluidSimulation {
    final int N = 128;
    //Sets bounds for the simulation window.
    final int iter = 16;
    //Sets rate at which the fluid moves
    final int SCALE = 4;
    //Sets the scale of the simulation, independent of bounds.
    float t = 0;
//Changes rate at which the time-steps operate

    Fluid fluid;

    void settings() {
        size(N*SCALE, N*SCALE);
    }

    void setup() {
        fluid = new Fluid(0.2, 0, 0.0000001);
        //Instantiate fluid, (Time interval, diffusion, viscosity)
        //Diffusion must be 0!
    }

    void draw() {
        background(0);
        int cx = int(0.5*width/SCALE);
        int cy = int(0.5*height/SCALE);
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                fluid.addDensity(cx+i, cy+j, random(50, 150));
            }
        }
        for (int i = 0; i < 2; i++) {
            float angle = noise(t) * TWO_PI * 2;
            PVector v = PVector.fromAngle(angle);
            v.mult(0.2);
            t += 0.01;
            fluid.addVelocity(cx, cy, v.x, v.y );
        }


        fluid.step();
        fluid.renderD();
        //fluid.renderV(); <- Don't use!
        //fluid.fadeD();
    }
}