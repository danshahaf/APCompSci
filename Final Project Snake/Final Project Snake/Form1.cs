using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Final_Project_Snake
{
    public partial class Form1 : Form
    { // setting integers, booleans and doubles.
        private int x = 0;
        private int y = 0;
        private Boolean left = false;
        private Boolean right = false;
        private Boolean down = false;
        private Boolean up = false;
        int score = 0;
        int h = Screen.PrimaryScreen.Bounds.Height;
        private Boolean border = false;
        int counter = 20;
        private Boolean timeinc = false;
        int time = 1;
        PictureBox picturebox7 = new PictureBox();
        List<PictureBox> bodylist = new List<PictureBox>();
        int count = 0;
        private Boolean gameover = false;
        int lastturnx = 0;
        int lastturny = 0;
        List<int> positionlistx = new List<int>();
        List<int> positionlisty = new List<int>();        
        int timer4count = 0;
        int highscore = 0;
        
        public Form1()
        {
            InitializeComponent();
        }
        private void button1_Click(object sender, EventArgs e)
        {            
        }
        private void pictureBox2_Click(object sender, EventArgs e)
        {
        }
        private void Form1_Load(object sender, EventArgs e)
        {           
            // the game's 60 second begin.
            timer2.Start();
            //Random spot on the screen.
            Random rand = new Random();
            x = rand.Next(25, 1300);
            y = rand.Next(25, 610);
    
        }
        private void timer1_Tick(object sender, EventArgs e)
        {           
            /// setting movememt.
            if (right)           
                pictureBox1.Left += 10;            
            else if (left)           
                pictureBox1.Left -= 10;            
            else if (down)            
                pictureBox1.Top += 10;           
            else if (up)            
                pictureBox1.Top -= 10;              
            /// random the food's location - if the snake hits the food, it will randomly move to another spot on the screen.
            if (pictureBox1.Bounds.IntersectsWith(pictureBox2.Bounds))
            {             
                    // add more time - 3 seconds
                timeinc = true;           
                //random food location
                score ++;
                label3.Text = score.ToString();
                pictureBox2.Location = new Point(x, y);
                Random random = new Random();
                x = random.Next(50, 1300);
                y = random.Next(20, 610);
                //duplicating the snake
                bodylist.Add(new PictureBox());
                bodylist[count].Size = new Size(16, 16);
                bodylist[count].Image = Properties.Resources.dot1;
                bodylist[count].SizeMode = PictureBoxSizeMode.StretchImage;
                Controls.Add(bodylist[count]);
                count++;
                // adding time to the progress bar
                if (progressBar1.Value < 93)
                    progressBar1.Value += 8;
                else
                    progressBar1.Value = 100;
            }

            /// if the snake hits the boredr, the game is over.
           
            if (pictureBox1.Bounds.IntersectsWith(pictureBox3.Bounds))
            {
                pictureBox1.Top += 10;              
                border = true;
                right = false;
                left = false;
                up = false;
                down = false;
                timer1.Stop();
                timer2.Stop();
                timer3.Stop();
                timer4.Stop();
                MessageBox.Show("GAME OVER");
                gameover = true;
                button1.Enabled = true;
            }
            else if (pictureBox1.Bounds.IntersectsWith(pictureBox4.Bounds))
            {
                pictureBox1.Top -= 10;
                border = true;
                right = false;
                left = false;
                up = false;
                down = false;
                timer1.Stop();
                timer2.Stop();
                timer3.Stop();
                timer4.Stop();
                MessageBox.Show("GAME OVER");
                gameover = true;
                button1.Enabled = true;
            }
            else if (pictureBox1.Bounds.IntersectsWith(pictureBox5.Bounds))
            {
                pictureBox1.Left -= 10;
                border = true;
                right = false;
                left = false;
                up = false;
                down = false;
                timer1.Stop();
                timer2.Stop();
                timer3.Stop();
                timer4.Stop();
                MessageBox.Show("GAME OVER");
                gameover = true;
                button1.Enabled = true;
            }
            else if (pictureBox1.Bounds.IntersectsWith(pictureBox6.Bounds))
            {
                pictureBox1.Left += 10;
                border = true;
                right = false;
                left = false;
                up = false;
                down = false;
                timer4.Stop();
                timer1.Stop();
                timer2.Stop();
                timer3.Stop();
                MessageBox.Show("GAME OVER");
                gameover = true;
                button1.Enabled = true;
            }
            //in case the snake tackles itself 
            foreach (PictureBox currentpicturebox in bodylist)
            {
                if (pictureBox1.Bounds.IntersectsWith(currentpicturebox.Bounds))
                {            
                    if(counter != 0)
                    {
                        timer4.Stop();
                        timer1.Stop();
                        timer2.Stop();
                        timer3.Stop();
                        right = false;
                        left = false;
                        down = false;
                        up = false;

                        MessageBox.Show("CONGRATULATIONS, YOU ATE YOURSELF, GAME IS OVER");
                        gameover = true;
                        button1.Enabled = true;
                    }        
                }
            }
            //setting high score
            if (gameover)
            {
                if (score > highscore)
                    highscore = score;
                label7.Text = highscore.ToString();
            }
        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            /// setting movement.
            if (e.KeyCode == Keys.Right)
            {
                right = true;               
                left = false;
                down = false;
                up = false;
            }
            if (e.KeyCode == Keys.Left)
            {
                
                left = true;               
                right = false;
                down = false;
                up = false;
            }               
            if (e.KeyCode == Keys.Down)
            {
                down = true;              
                right = false;
                left = false;
                up = false;
            }
            if (e.KeyCode == Keys.Up )
            {
                up = true;               
                right = false;
                left = false;
                down = false;
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {           
        }
        private void Form1_KeyUp(object sender, KeyEventArgs e)
        {            
        }
        private void pictureBox1_Click(object sender, EventArgs e)
        {
        }
        private void timer2_Tick(object sender, EventArgs e)
        {
            //setting time propeties
            if(counter >= 20)
            {
                progressBar1.Value = 100;
            }
            else if(counter < 20)
            {
                progressBar1.Value = ((counter  * 100)/ 20);
            }
            if ( counter <= 6)
            {
                label5.BackColor = Color.Yellow;
                label5.Font = new Font("Arial", 18);
                label5.ForeColor = Color.Red;
            }
            else if ( counter > 6)
            {
                label5.BackColor = Color.White;
                label5.Font = new Font("Modern", 14);
                label5.ForeColor = Color.Black;
            }
            // setting time for the ghame - should be around 60 seconds to play.
            if (border)
                timer2.Stop();
            else
            {
                counter--;
                label5.Text = counter.ToString();
                if (counter == 0)
                {
                    right = false;
                    left = false;
                    up = false;
                    down = false;
                    timer2.Stop();
                    MessageBox.Show("YOU RAN OUT OF TIME  - GAME OVER");
                    gameover = true;
                    button1.Enabled = true;
                }
            }
            if (timeinc)
            {
                counter += 4;
                label6.Visible = true;
                timeinc = false;
            }
            if (timeinc == false)
                label6.Visible = false;
        }

        private void label6_Click(object sender, EventArgs e)
        {
        }
        private void timer3_Tick(object sender, EventArgs e)
        {           
        }
        private void timer3_Tick_1(object sender, EventArgs e)
        {
            /// adding 5 seconds when eats food
            if (timeinc && time == 1)
            {
                label6.Visible = true;
                time = 0;
            }
            else
            {
                label6.Visible = false;
                time = 1;
            }
        }
        private void timer4_Tick(object sender, EventArgs e)
        {
            // setting the snake's tail follow the head's path
            timer4count++;
            //list of turning points
                lastturnx = pictureBox1.Location.X;
                lastturny = pictureBox1.Location.Y;

                positionlistx.Add(lastturnx);
                positionlisty.Add(lastturny);
            //setting space betweens the snake body's parts using time interval in timer 4
            int bodylistcounter = 1;
            foreach(PictureBox currentpicturebox in bodylist)
            {
                currentpicturebox.Location = new Point(positionlistx[timer4count - 4 * bodylistcounter], positionlisty[timer4count - 4 * bodylistcounter]);
                bodylistcounter++;
            }
        }

        private void pictureBox2_Click_1(object sender, EventArgs e)
        {
        }
        private void button1_Click_1(object sender, EventArgs e)
        {
            /// deleting marks
            foreach(PictureBox currentpicturebox in bodylist)
            {
                currentpicturebox.Visible = false;
            }
            // reseting variable booleans and lists
            left = false;
            right = false;
            down = false;
            up = false;
            gameover = false;
            score = 0;
            h = Screen.PrimaryScreen.Bounds.Height;
            border = false;
            counter = 20;
            timeinc = false;
            time = 1;
            count = 0;
            progressBar1.Value = 100;
            lastturnx = 0;
            lastturny = 0;
            timer4count = 0;
            pictureBox1.Location = new Point(640,334);
            positionlistx.Clear();
            positionlisty.Clear();
            bodylist.Clear();
            label3.Text = "0";
            label5.Text = "20";
            timer1.Start();
            timer2.Start();
            timer3.Start();
            timer4.Start();
            button1.Enabled = false;
    }
        private void progressBar1_Click(object sender, EventArgs e)
        {           
        }
        private void label8_Click(object sender, EventArgs e)
        {
        }
    }
}
