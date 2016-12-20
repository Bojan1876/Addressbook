/**
 * 
 */
$(function() {
	$.ajax({
		url : '/persons'
	}).done(
			function(entries) {
				var $list = $('#addressbook');
				var personTemp = $list.find('#personTemp').html();
				var numberTemp = $list.find('#numberTemp').html();
				var emailTemp = $list.find('#emailTemp').html();
				var addressTemp = $list.find('#addressTemp').html();
				var noteTemp = $list.find('#noteTemp').html();

				$.each(entries, function(index) {
					var entry = entries[index];

					var numbers = '';
					var addresses = '';
					var emails = '';
					var notes = '';

					$.each(entry.details, function(index) {
						var detail = entry.details[index];

						if (detail.type.match('PHONE')) {
							numbers += numberTemp.replace('{{phone}}',
									detail.value);
						} else if (detail.type.match('ADDRESS')) {
							addresses += addressTemp.replace('{{address}}',
									detail.value);
						} else if (detail.type.match('EMAIL')) {
							emails += emailTemp.replace('{{email}}',
									detail.value);
						} else if (detail.type.match('NOTE')) {
							notes += noteTemp
									.replace('{{note}}', detail.value);
						}
					});

					$list.append(personTemp.replace('{{name}}', entry.name)
							.replace('{{phones}}', numbers).replace(
									'{{emails}}', emails).replace(
									'{{addresses}}', addresses).replace(
									'{{notes}}', notes));
				});

			});
});