#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Cóż za piękny dzień dramat biograficzny USA 2019 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/05-9FA1CA3D-0E92-4E02-ADFE-80E926A9564B HBO 17-35 CÓŻ 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/05-9FA1CA3D-0E92-4E02-ADFE-80E926A9564B_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/05-9FA1CA3D-0E92-4E02-ADFE-80E926A9564B_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/05-9FA1CA3D-0E92-4E02-ADFE-80E926A9564B_URL.sh" \
   --button=gtk-quit\:1 &
