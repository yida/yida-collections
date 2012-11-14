DESCRIPTION = "Common code for working with images in ROS"
HOMEPAGE = "http://www.ros.org/wiki/image_common?distro=fuerte"
LICENSE = "BSD LGPL"
LIC_FILES_CHKSUM = "file://../../BSD-Willow.txt;md5=51a25bf2b127f8eb390aa2c2d5ca028d"
DEPENDS = "ros-fuerte-gumstix ros-fuerte-gumstix-native"
SRCREV = "40258"
PR = "r0"

SRC_URI = "svn://code.ros.org/svn/ros-pkg/stacks/image_common;module=trunk;proto=https \
           file://BSD-Willow.txt"

S = "${WORKDIR}/image_common"

LOCAL_STACKS_PREFIX = "/home/root/ros"

inherit cmake

export ROS_ROOT = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/ros"
export ROS_PACKAGE_PATH = "${STAGING_DIR_HOST}/${LOCAL_STACKS_PREFIX}:${STAGING_DIR_NATIVE}/opt/ros/fuerte/share:${WORKDIR}:${STAGING_DIR_HOST}/opt/ros/fuerte/share:${STAGING_DIR_HOST}/opt/ros/fuerte/stacks"
export ROSLISP_PACKAGE_DIRECTORY = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/common-lisp/ros"
export ROS_DISTRO = "fuerte"
export ROS_ETC_DIR = "${STAGING_DIR_HOST}/opt/ros/fuerte/etc/ros"
export PYTHONPATH = "${STAGING_DIR_HOST}/opt/ros/fuerte/lib/python2.7/site-packages"
PATH =+ "${STAGING_DIR_NATIVE}/opt/ros/fuerte/bin:"
export CMAKE_PREFIX_PATH="${STAGING_DIR_HOST}/opt/ros/fuerte/share/catkin/cmake/Modules:${STAGING_DIR_HOST}/opt/ros/fuerte"
export LD_LIBRARY_PATH = "${STAGING_DIR_NATIVE}/opt/ros/fuerte/lib"
PKG_CONFIG_PATH=+":${STAGING_DIR_HOST}/opt/ros/fuerte/lib/pkgconfig"

cmake_do_configure_prepend() {
  cp -rf ${WORKDIR}/trunk/* ${WORKDIR}/image_common/.
  #  rospack list
}
