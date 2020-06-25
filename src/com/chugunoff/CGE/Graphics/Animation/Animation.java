package com.chugunoff.CGE.Graphics.Animation;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Animation {
        Thread animate, nextDo = null;
        int count = 0;
        int max_frames;
        long sleep;
        boolean isLoop;
        public JLabel label;
        public ImageIcon[] frames;

        void initAnimate () {
            label.setVisible(true);
            animate = new Thread(new Runnable() {
                @Override
                public void run() {
                    if (isLoop) {
                        while (isLoop) {
                            if (count > max_frames) {
                                count = 0;
                            }
                            label.setIcon(frames[count]);
                            sleep();
                            count++;
                        }

                    } else {
                        isLoop = true;
                        while (isLoop) {
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            label.setIcon(frames[count]);
                            sleep();
                            count++;
                            if (count > max_frames && nextDo != null) {
                                nextDo.start();
                                isLoop = false;
                                label.setVisible(false);
                            } else if (count > max_frames) {
                                isLoop = false;
                                label.setVisible(false);
                            }
                        }
                    }
                }
            });
        }

    public Animation(ImageIcon[]frames, JLabel label ,int max_frames, long sleep, boolean isLoop){
            this.label = label;
            this.frames = frames;
            this.sleep = sleep;
            this.isLoop = isLoop;
            this.max_frames = max_frames;
            initAnimate();
        }

    public Animation(ImageIcon[]frames, JLabel label ,int max_frames, long sleep, Thread nextDo){
            this.label = label;
            this.frames = frames;
            this.sleep = sleep;
            this.nextDo = nextDo;
            this.max_frames = max_frames;
            initAnimate();
        }

        public void stop () {
            label.setVisible(false);
        }

        public void animate () {
            animate.start();
        }

        public void sleep () {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }



