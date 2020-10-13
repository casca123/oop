package oop_lab_2;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class билет {
	
	Hashtable<фильм, Vector<зритель>> фильмы = new Hashtable<фильм, Vector<зритель>>();
	
	private билет() {}
	
	public static билет инициализация() {
		билет bil = new билет();
		фильм новый = new фильм();
		новый.название = "Плохие парни навсегда";
		новый.режиссер = "Билал Фалла";
		новый.жанр = жанр.боевик;
		новый.код = "01";
		новый.состояние = состояние.естьбилеты;
		bil.фильмы.put(
				новый,
				new Vector<>());
		новый = new фильм();
		новый.название = "Скуби-Ду";
		новый.режиссер = "Тони Червоне";
		новый.жанр = жанр.детектив;
		новый.код = "02";
		новый.состояние = состояние.естьбилеты;
		bil.фильмы.put(
				новый,
				new Vector<>());
		return bil;
	}
	
	public void ПродажаБилета(String кодФильма, зритель зритель) {
		Optional<Entry<фильм, Vector<зритель>>> find = фильмы.entrySet().stream().filter(e->e.getKey().код.equals(кодФильма)).findFirst();
		if(find.isPresent()) {
			if(find.get().getKey().состояние == состояние.естьбилеты) {
				System.out.println("Билет продан!");
			}
			else
				System.out.println("Билетов нет!");
		}
		else
			System.out.println("Фильма с таким кодом нет!");
	}
	
	public void ВозвратБилета() {
		System.out.print("...\n");
	}
	
	public void каталог() {
		фильмы.entrySet().stream().forEach(e->{ фильм fil = e.getKey();
		System.out.println(fil.режиссер + "\n" + fil.название + "\n" + fil.код + "\n");
		});	
		
	}
}
