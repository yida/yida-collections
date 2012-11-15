S = "${WORKDIR}/${SETNAME}"

LOCAL_STACKS_PREFIX = "/home/root/ros"

inherit cmake

INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

S = "${WORKDIR}/${SETNAME}/${SRCNAME}"

export ROS_ROOT = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/ros"
export ROS_PACKAGE_PATH = "${STAGING_DIR_HOST}/${LOCAL_STACKS_PREFIX}:${STAGING_DIR_NATIVE}/opt/ros/fuerte/share:${WORKDIR}:${STAGING_DIR_HOST}/opt/ros/fuerte/share:${STAGING_DIR_HOST}/opt/ros/fuerte/stacks"
export ROSLISP_PACKAGE_DIRECTORY = "${STAGING_DIR_HOST}/opt/ros/fuerte/share/common-lisp/ros"
export ROS_DISTRO = "fuerte"
export ROS_ETC_DIR = "${STAGING_DIR_HOST}/opt/ros/fuerte/etc/ros"
export PYTHONPATH = "${STAGING_DIR_HOST}/opt/ros/fuerte/lib/python2.7/site-packages"
PATH =+ "${STAGING_DIR_NATIVE}/opt/ros/fuerte/bin:${STAGING_DIR_HOST}/opt/ros/fuerte/bin:"
export CMAKE_PREFIX_PATH="${STAGING_DIR_HOST}/opt/ros/fuerte/share/catkin/cmake/Modules:${STAGING_DIR_HOST}/opt/ros/fuerte"
export LD_LIBRARY_PATH = "${STAGING_DIR_NATIVE}/opt/ros/fuerte/lib"
PKG_CONFIG_PATH=+":${STAGING_DIR_HOST}/opt/ros/fuerte/lib/pkgconfig"

ROS_PACKAGE_PATH += "${WORKDIR}/${SETNAME}:"
ROS_STACKS_INSTALL_PREFIX = "${D}/${LOCAL_STACKS_PREFIX}"


sysroot_stage_dirs_append() {
  sysroot_stage_dir $from/home $to/home
}


FILES_${PN} = "/home/root/ros/*"

