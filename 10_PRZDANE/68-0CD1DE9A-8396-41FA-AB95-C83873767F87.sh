#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Equilibrium film SF USA 2002 ^^^" \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/68-0CD1DE9A-8396-41FA-AB95-C83873767F87 HBO 23-50 EQUILIBRIUM 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/68-0CD1DE9A-8396-41FA-AB95-C83873767F87_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/68-0CD1DE9A-8396-41FA-AB95-C83873767F87_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/68-0CD1DE9A-8396-41FA-AB95-C83873767F87_URL.sh" \
   --button=gtk-quit\:1 &
