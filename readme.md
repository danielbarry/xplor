# Xplor

## Contents

(1) Introduction

(2) Build Process

(3) Program Use

## (1) Introduction

This is a simple program to demonstrate the usefulness and effectiveness of
neural networks that learn on the fly. For this project we hope to be able to
demonstrate good practices of autonomous learning on-the-fly and how such a
system can be useful in tasks such as navigation.

For this project we have a few learning outcomes:

  * Neural network's robustness to noise in systems that employ continuous
  learning.
  * Size and speed of a neural network capable of completing such a task.
  * Ability to prove their existence and be able to visualise short term and
  long term memory in neural networks.
  * Suitability and safety of neural networks in commercial systems in the
  home.

If this project is successful we will look to build a robot that will
demonstrate these points more effectively on much less capable hardware and
subject to real noise. We expect there to also be additional noise and problems
inherent in a real life environment that a simulation can not encounter.

## (2) Build Process

This program uses an `ant` `build.xml` file to build the code, which can be
done by running the following in the build directory:

    ant

It's as simple as that. If we have done our job correctly then a series of
parts should be built.

## (3) Program Use

To run the program, simply navigate to the `dist` directory that will appear
after a successful build. Next, you can run the following:

    java -jar xplor

This will start the program with the basic settings, by default a GUI should
appear.
