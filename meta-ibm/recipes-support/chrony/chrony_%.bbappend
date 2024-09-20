FILESEXTRAPATHS:prepend := "${THISDIR}/chrony:"

install_chrony_configuration() {
    install -D -m 0644 ${WORKDIR}/chronyd.service ${D}${systemd_system_unitdir}/chronyd.service
}

SRC_URI:append:df-chrony = " file://chronyd.service"
do_install:append:huygens() {
      install_chrony_configuration
}
