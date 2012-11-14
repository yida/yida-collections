#DESCRIPTION = "Willow Garage low-level build system macros and infrastructure"

VER_catkin = "0.4.4"

SRC_URI += "git://github.com/wg-debs/catkin-release.git;destsuffix=catkin;name=catkin \
            file://0001-use-Use-CMAKE_FIND_ROOT_PATH-when-searching-for-incl.patch;apply=yes;patchdir=catkin;pnum=1 \
            file://0002-skip-rt-check.patch;apply=yes;patchdir=catkin;pnum=1"

SRCREV_catkin = "debian/ros-fuerte-catkin_${VER_catkin}_lucid" 

