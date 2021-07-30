package commandPattern;

public class Client {
	
	public static void main(String[] args) {
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Alarm alarm = new Alarm();
		Command alarmStartCommand = new AlarmStartCommand(alarm);
		
		Button button1 = new Button(lampOnCommand);
		button1.pressed();
		
		Button button2 = new Button(alarmStartCommand);
		button2.pressed();
		button2.setCommand(lampOnCommand);
		button2.pressed();
		button2.pressed();
		button1.pressed();
	}

}
