package com.ssc.end;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.airbnb.lottie.LottieAnimationView;

public class AnimacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);

        LottieAnimationView animationView = findViewById(R.id.animation_view);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                // La animación ha comenzado
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                // La animación ha terminado, aquí puedes iniciar otra actividad
                Intent intent = new Intent(AnimacionActivity.this, OtraActividad.class);
                startActivity(intent);
                finish(); // Esto es opcional, dependiendo de tu flujo de la aplicación
            }

            @Override
            public void onAnimationCancel(Animator animation) {
                // La animación ha sido cancelada
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                // La animación se ha repetido
            }
        });
    }
}
