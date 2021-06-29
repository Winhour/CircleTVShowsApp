#! /bin/bash
# Script generated by przyp.sh
#

paplay --volume=20000 "/home/rysio/Pobrane/PROGRAM_TV_ZEE/przypominajka.ogg" &
export DISPLAY=:0 && yad --title "Świat z góry     Anglia i Walia Od Symonds po serial dokumentalny Wielka Brytania " \
   --on-top --sticky --center \
   --borders=5 \
   --timeout=1200 \
   --timeout-indicator=bottom \
   --image "/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/10-9ED02AE6-5716-4250-9873-4F91A309CA7B Planete_HD 18-00 ŚWIAT 7_PICTURE_OUT.png" \
   --button="Otwórz obrazki"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/10-9ED02AE6-5716-4250-9873-4F91A309CA7B_PIC.sh" \
   --button="Otwórz forum"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/10-9ED02AE6-5716-4250-9873-4F91A309CA7B_FORUM.sh" \
   --button="Otwórz URL"!gtk-ok\:"/home/rysio/Pobrane/PROGRAM_TV_ZEE/10_PRZDANE/10-9ED02AE6-5716-4250-9873-4F91A309CA7B_URL.sh" \
   --button=gtk-quit\:1 &