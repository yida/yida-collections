
VER_common-msgs = "1.8.7"

SRC_URI += "git://github.com/wg-debs/common_msgs-release.git;destsuffix=common_msgs;name=common-msgs \
            file://0001-add-NO_CMAKE_FIND_ROOT_PATH-to-actionlib_msg-extra.patch;apply=yes;patchdir=common_msgs;pnum=1"
            
SRCREV_common-msgs = "debian/ros-fuerte-common-msgs_${VER_common-msgs}_lucid" 

