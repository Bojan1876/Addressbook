/**
 * 
 */
$(function() {
	$.ajax({
		url : '/persons'
	}).done(function(persons) {
		var $list = $('#addressbook');
		var personTemp = $list.find('#personTemp').html();
		var numberTemp = $list.find('#numberTemp').html();
		var emailTemp = $list.find('#emailTemp').html();
		var addressTemp = $list.find('#addressTemp').html();
		var noteTemp = $list.find('#noteTemp').html();
		
		$.each(persons, function(index){
			var person = persons[index];
			
			var phones='';
			$.each(person.phones, function(index){
				var number=person.phones[index].number;
				phones+=numberTemp.replace('{{number}}', number);
			});
			
			var emails='';
			$.each(person.emails, function(index){
				var email=person.emails[index].email;
				emails+=emailTemp.replace('{{email}}', email);
			});
			
			var addresses='';
			$.each(person.addresses, function(index){
				var address=person.addresses[index].address;
				addresses+=addressTemp.replace('{{address}}', address);
			});
			
			var notes='';
			$.each(person.notes, function(index){
				var note=person.notes[index].note;
				notes+=noteTemp.replace('{{note}}', note);
			});
			
			$list.append(
				personTemp.replace('{{name}}',person.firstName + ' ' +person.lastName)
				.replace('{{phones}}', phones).replace('{{emails}}', emails).replace('{{addresses}}', addresses).replace('{{notes}}', notes)
			);
		});
		
	});
});