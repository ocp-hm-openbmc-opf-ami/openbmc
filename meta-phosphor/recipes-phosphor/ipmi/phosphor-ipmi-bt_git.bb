SUMMARY = "Phosphor OpenBMC BT to DBUS"
DESCRIPTION = "Phosphor OpenBMC BT to DBUS."
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
DEPENDS += "systemd"
PROVIDES += "virtual/obmc-host-ipmi-hw"
SRCREV = "53757b38f3e6d9f504fb8d5ce2db32ac5a034b8a"
PV = "1.0+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/openbmc/btbridge;branch=master;protocol=https"

S = "${WORKDIR}/git"

inherit meson pkgconfig
inherit obmc-phosphor-dbus-service

RRECOMMENDS:${PN} += "phosphor-ipmi-host"

RPROVIDES:${PN} += "virtual-obmc-host-ipmi-hw"

DBUS_SERVICE:${PN} = "org.openbmc.HostIpmi.service"
