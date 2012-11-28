require geometry.inc

DESCRIPTION = "tf is a package that lets the user keep track of multiple coordinate frames over time."
HOMEPAGE = "http://www.ros.org/wiki/tf?distro=fuerte"
DEPENDS += "ros-fuerte-bullet ros-fuerte-angles"
PR = "r3"

SRC_URI += "file://tf.patch;patchdir=../../../.;pnum=0"

SRCNAME="tf"

do_install_append() {
  stacks_do_file_install catkin.cmake
  stacks_do_file_install conf.py 
  stacks_do_file_install index.rst 
  stacks_do_file_install remap_tf.launch
  stacks_do_file_install tf_python.rst
}
